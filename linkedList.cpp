#include <iostream>
using namespace std;

struct node{
  int data;
  node *next;
};
class list{
  private:
  node *head, *tail;
  public:

  list(){
    head=NULL;
    tail=NULL;
  }
  void createNode(int n); //create node; add node to the last
  void insertion(int n); //insert node at starting pos
  void insertionPos(int pos, int n); //insert at any pos

  void display();
  
};

void list:: createNode(int n){
  node *temp= new node;
  temp->data=n;
  temp->next=NULL;
  if(head==NULL){
    head=temp;
    tail=head;
    temp=NULL;
  }
  else{
    tail->next=temp;
    tail=temp;
  }
}
//insertion of list at the starting

void list::insertion(int n){
  node *temp=new node;
  temp->data=n;
  temp->next=head; //new node will have adress of current head
  head=temp; //temp will now become the new head
}

void list:: insertionPos(int pos, int n){
  node *previous= new node; //node pointing to previous node
  node *current = new node;// node pointing to current node
  node *temp= new node;// temprory node

  for(int i=1;i<pos;i++){
    previous=current;
    current= current->next;
  }
  temp->data=n;
  previous->next=temp;
  temp->next=current;
}

void list:: display(){
  node *temp= new node;
  temp=head;
  while(temp!=NULL){
    cout<<temp->data;
    temp=temp->next;
  }
}


int main() {

  list l;
  l.createNode(1);
  l.createNode(2);
  l.createNode(3);
  l.createNode(4);
  l.createNode(5);
  l.createNode(6);

  l.display();
}