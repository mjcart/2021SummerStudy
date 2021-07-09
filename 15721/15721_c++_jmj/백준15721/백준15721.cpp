
#include <iostream>
#include<assert.h>
using namespace std;

class Queue {
public:
    Queue();
  // ~Queue();
    void enqueue(int e,int id);
    int dequeue();
    int front();
    bool isEmpty();
    struct Node;
    typedef Node* nodePtr;
    struct Node {
        int id;
        int data;
        nodePtr next;
    };
    nodePtr f;
    nodePtr r;
};

Queue::Queue() {
    f = 0;
    r = 0;
}

//Queue::~Queue() {
//    while (!isEmpty()) {
//        nodePtr n(f);
//        f = f->next;
//        delete n;
//
//    }
//}

void Queue ::enqueue(int e,int id)
{
    // create a new node, insert it at the rear of the queue
    nodePtr n(new Node);
    assert(n);
    n->next = 0;
    n->data = e;
    n->id = id;
    if (f != 0) { // existing queue is not empty
        r->next = n; // add new element to end of list
        r = n;
    }
    else {// adding first item in the queue
        f = n; // so front, rear must be same node
        r = n;
    }
}

bool Queue::isEmpty()
{
    // true if the queue is empty -- when f is a null pointer
    return bool((f == 0)||(f==f->next));
}

int fundaegiMaker(Queue a,int turn, bool fundaegi) {
    int fun = 0;
    int daegi = 0;
    int time = 2;
    int result = -1;
    Queue::Node* head=a.f;
    while (1) {
        for (int i = 0; i < 2; i++) {
            head->data = 0;
            fun += 1;
            result += 1;
            head = head->next;
            if (fundaegi == 0 && turn == fun) {
                return result;
            }
            head->data = 1;
            daegi += 1;
            result += 1;
            head = head->next;
            if (fundaegi == 1 && turn == daegi) {
                return result;
            }
        }
        for (int i = 0; i < time; i++) {
            head->data = 0;
            fun += 1;
            result += 1;
            head = head->next;
            if (fundaegi == 0 && turn == fun) {
                return result;
            }
        }
        for (int i = 0; i < time; i++) {
            head->data = 1;
            daegi += 1;
            result += 1;
            head = head->next;
            if (fundaegi == 1 && turn == daegi) {
                return result;
            }
        }
        time += 1;
    }
        
}
int main()
{
    int nPlayer;
    int turn;
    bool fundaegi;
    int result;
    cin >> nPlayer >> turn >> fundaegi;
    Queue Table;
    for (int i = 0; i < nPlayer; i++) {
        Table.enqueue(0,i);
    }
    Table.r->next = Table.f;
    result = fundaegiMaker(Table, turn, fundaegi);
    cout <<result % nPlayer<< endl;
}
