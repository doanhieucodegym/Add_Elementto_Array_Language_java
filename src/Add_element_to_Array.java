import java.util.Scanner;

public class Add_element_to_Array {
    public static void main(String[] args) {
        int arrInput [] = {3,4,6,0,0,0,};


        Add_element_to_Array addObj = new Add_element_to_Array();
        addObj.show(arrInput);
        addObj.inset(7,arrInput,1);
        System.out.println();
        addObj.show(arrInput);

        if (2>1) return;


//        Scanner sc = new Scanner(System.in);
//        // mang cần  thêm
//        int [] arry ={2,4,5,7,6};
//        //phần tử  thêm vào mang
//        System.out.println("phần tử cần  thêm ");
//        int k = sc.nextInt();

    }
    public void inset(int value, int [] a, int location ){
        // move tat ca phan tu tu vi tri can insert cho den cuoi mang\
        for (int i=a.length-1; i> location; i-- ){
            a[i] = a[i-1];
        }
        // gan gia tri can insert vao dung vi tri da chon
        a[location] = value;
    };
    public void show(int [] a){
        for (int i=0;  i<a.length; i++){
            System.out.print(" "+a[i]);
        }

        //cách  mới thêm phần tử  mảng"
        /*
        * public static void addElement(int a[],int pos,int n)
	{
		// 1 2 3 4 5
		// 1 2 3 6 4 5
		// tao 1 mang b có kích thước là n+1
		int b[] = new int [a.length+1];
		// chuyen gia tri sang mang b
		for(int i = 0 ; i < a.length ; i ++)
			b[i] = a[i];

		for(int i = b.length-1 ; i > pos ; i--)
			b[i] = b[i-1];
		b[pos] = n;
		// delete mang a
		a = new int [b.length];
		for(int i = 0 ; i < b.length; i++)
			a[i] = b[i];
	}
        *
        *
        *
        * */
    }
}
