#include <iostream>
using namespace std;

int main(){
	string nama;
	int a[10]={1,2,3,4,5,6,7,8,9,10};
	int b[2][3]={{1,2,3},{4,5,6}};
	int c = 1;
	int d = 1;
	
	cout <<"Masukkan nama : ";
	cin >> nama;
	
	cout <<"Nama : "<< nama << endl;
	
	cout <<"Tampilkan array 1d = "<< a[0] << a[1] << a[2] << a[3] << a[4] << a[5] << a[6] << a[7] << a[8] << a[9] << endl;
	
	cout <<"Tampilkan array 2 dimensi : \n";
	for(int i = 0; i < 2; i++){
		for(int j = 0; j < 3; j++){
			cout << b[i][j] <<" ";
		}
		cout << endl;
	}
	
	while(c <= 5){
		cout <<"Ini perulangan while ke- "<< c << endl;
		c++;
	}
	
	do {
		cout <<"Ini perulangan do while ke- "<< d << endl;
		d++;
	} while(d <= 5);
	
	int e = 2;
	
	if(e > 1){
		cout <<"2 lebih besar dari 1 \n";
	}else{
		cout <<"1 lebih kecil dari 2 \n";
	}
	
	// ini adalah comment di bahasa c++
	/* ini merupakan comment multi di bahasa c++ */
}
