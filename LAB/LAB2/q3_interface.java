import java.util.*;

interface i1 {
	void enqueue();
	int dequeue();
}

class first1 implements i1 {
	Scanner scan = new Scanner(System.in);
	int queue[],ele,n,front=0,rear=-1,arr[],rear1,i,flag=1,k,ele1,arr1[];
	first1(int in) {
		n = in;
		queue = new int[n];
	}
	
	public void enqueue() {
		System.out.println("Enter ele: ");
		ele = scan.nextInt();
		if((front==0 && rear == n-1)||(front>0 && rear==front-1)){
			System.out.println("full so creating a new queue of double size: ");
			flag=0;
			arr = new int[n+2];
			arr1 = new int[n+1];
			rear1 = rear;
		if(front==0 && rear == n-1) {
			for(i=front;i<=rear1;i++) {
			arr[i] = queue[i];
			}
			
			queue = new int[2*n];
			n*=2;
			rear=-1;
			k=0;
			for(i=front;i<=rear1;i++) {
				queue[k++] = arr[i];
			}
			front=0;
			rear = k-1;
			queue[++rear] = ele;
		}
	else {
		for(i=0;i<=rear;i++) {
			arr[i] = queue[i];
		}
		for(i=front;i<n;i++) {
			arr1[i] = queue[i];
		}
		queue = new int[2*n];
		rear=-1;
		k=0;
		for(i=front;i<n;i++) {
			queue[k++] = arr1[i];
		}
		for(i=0;i<=rear;i++) {
			queue[k++]=arr[i];
		}
		n*=2;
		front=0;
		rear = k-1;
		queue[++rear] = ele;
		
	}
		}
	else if(front>0 && rear == n-1) {
		rear = 0;
		queue[rear]=ele;
	}
	else {
		queue[++rear] = ele;
	}
	}

	public int dequeue() {
		if((front==0 && rear==-1)) {
			System.out.println("Empty ");
			return 0;
		}
	else if(front==rear) {
		ele1= queue[front];
		front=0;
		rear=-1;
		return ele1;
		}
	else if(front==n-1) {
		ele1 = queue[front];
		front=0;
		return ele1;
	}
	else {
		return (queue[front++]);
		}
	}
	
	void display() {
	if((front==0) && (rear==-1)) {
		System.out.print("Empty\n");
	}

	else	if(front<=rear) {
		for(i=front;i<=rear;i++) {
			System.out.print(queue[i]+" ");
		}
	}
else {
	for(i=front;i<n;i++) {
			System.out.print(queue[i]+" ");
		}
	
	for(i=0;i<=rear;i++) {
			System.out.print(queue[i]+" ");
		}
	}
	}
}

class first {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n,ch,ele1;
		System.out.println("Enter n: ");
		n = scan.nextInt();
		first1 f = new first1(n);
		do {
			System.out.println("Enter 1 to insert 2 to delete 3 to display 4 to exit: ");
			ch = scan.nextInt();
			switch(ch) {	
				case 1: f.enqueue();
					if(f.flag==0) {
						System.out.println("oversmart ");
						f.flag=1;
					}
					break;
				case 2:ele1 = f.dequeue();
					System.out.println(ele1);
					break;
				case 3:f.display();
					System.out.println("\n");
					break;
				}
		}while(ch!=4);
	}
}
