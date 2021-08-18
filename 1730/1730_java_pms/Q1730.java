package q1730;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1730 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		char[][] board = new char[n][n];	//	n x n �� �迭 ����
		for(char[] row: board)				// �迭�� ���� . �� ä�� 
			Arrays.fill(row, '.');
		
		int x = 0, y = 0;					// �� ������ �κ� ���� ��ġ�� ��Ÿ�� �ε��� ����
		
		for(int i = 0; i < s.length(); i++) {
			char move = s.charAt(i);
			
			switch(move) {
			case 'D':
				if(x != n-1) {				// �κ� ���� �Ʒ��� �� ������ �� �ִ��� Ȯ�� 
					
					if(board[x][y] == '.') {
						board[x][y] = '|';
					}else if(board[x][y] == '-') {
						board[x][y] = '+';
					}
					x++;
					if(board[x][y] == '.') {
						board[x][y] = '|';
					}else if(board[x][y] == '-') {
						board[x][y] = '+';
					}
				}
				break;
			case 'U':
				if(x != 0) {				// �κ� ���� ���� �� ������ �� �ִ��� Ȯ��
					if(board[x][y] == '.') {
						board[x][y] = '|';
					}else if(board[x][y] == '-') {
						board[x][y] = '+';
					}	
					x--;
					if(board[x][y] == '.') {
						board[x][y] = '|';
					}else if(board[x][y] == '-') {
						board[x][y] = '+';
					}
				}
				
				break;
			case 'L':
				if(y != 0) {				// �κ� ���� �������� �� ������ �� �ִ��� Ȯ��
					if(board[x][y] == '.') {
						board[x][y] = '-';
					}else if(board[x][y] == '|') {
						board[x][y] = '+';
					}
					y--;
					if(board[x][y] == '.') {
						board[x][y] = '-';
					}else if(board[x][y] == '|') {
						board[x][y] = '+';
					}
				}
				break;
			case 'R':
				if(y != n-1) {				// �κ� ���� ���������� �� ������ �� �ִ��� Ȯ��
					if(board[x][y] == '.') {
						board[x][y] = '-';
					}else if(board[x][y] == '|') {
						board[x][y] = '+';
					}
					y++;
					if(board[x][y] == '.') {
						board[x][y] = '-';
					}else if(board[x][y] == '|') {
						board[x][y] = '+';
					}
				}
				break;
			}
		}
		for(int i = 0; i < n; i++) {			// ����� ���
			for(int j = 0; j < n; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
}
