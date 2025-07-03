#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main()
{
    int uguss , guss; 
    srand(time(0));
    guss = rand() % 3 + 1;

    cout<<"Welcome To Stone , Paper , Scissor Game"<<endl;
    cout<<"1 for stone\n2 for peper\n3 for scissor"<<endl;
    cout<<"Enter your guess :";
    cin>>uguss;
    cout<<"My guss is :"<<guss<<"\nYour guss is :"<<uguss<<endl;

    if (uguss == guss)
    {
        cout<<"ITS TIE !"<<endl;
    }
    else if((uguss ==1 && guss == 2) || (uguss == 2 && guss == 3) || (uguss ==3 && guss == 1))
    {
        cout<<"YOU WINN BABY !."<<endl;

    }
    else{
        cout<<"I WINN BABY !."<<endl;
    }
    
}