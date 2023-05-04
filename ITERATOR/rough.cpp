#include <iostream>
#include <vector>
using namespace std;

class Iterator{
    public:
        virtual bool hasNext() = 0;
        virtual int getNext() = 0;
};

class vectorIterator : public Iterator{
    private: 
        vector<int>& vec;
        int index;      
    public:
        vectorIterator(vector<int>& v) : vec(v), index(0) {}
        int getNext() {
            return vec[index++];
        }
        bool hasNext() {
            return index < vec.size();
        }
};

class Collection {
    public:
    virtual Iterator* createIterator() = 0;
};

class VectorCollection : public Collection{
    private: 
        vector<int>& vec;
    public:
        VectorCollection(vector<int>& v) : vec(v) {} 
        Iterator* createIterator(){
            return new vectorIterator(vec);
        }
};

int main(){
    vector<int> vec = {12,5,3,6765,35};
    Collection* collection = new VectorCollection(vec);
    Iterator* iterator = collection->createIterator();
    while(iterator->hasNext()){
        cout<<iterator->getNext()<< " ";
    }
    cout<<endl;
}