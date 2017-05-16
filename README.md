## 객체지향

객체지향에서 단일 객체는 new를 하고 .을 통해 직접 접근하면 되는데


## 상속


> 상속은 객체의 로직을 그대로 물려 받는 또 다른 객체를 만들 수 있는 기능을 의미한다.



```java
public class Father {
	public String lastname;
	public String name;
	
	public int age;
	public int money;
	
	public String house;
	public String car;
	public String wife;
	
}
```


```java
public class Son extends Father{

	public String girlfriend;
	
}
```


### Override

기능은 유사하지만 다른 기능을 사용할때 

**Father.java**

goDesti 라는 메소드를 생성 

```java
	public void goDesti(){
		System.out.println("회사로 출근");
	}
```

**Main.java**

```java
		Son son = new Son();
		son.goDesti();
```

Son 클래스를 생성해서 goDesti를 실행하면 "회사로 출근" 이라는 결과값이 나오는것을 볼 수 있다

### 이때 

**Son.java**

```java
	public void goDesti(){
		System.out.println("PC방으로 갑니다");
	}
```

같은 이름의 매소드로 재정의를 하면 "PC방으로 갑니다" 라는 결과값을 볼 수 있다 


### Overload

함수는 동일한데 들어가는 인자가 다를때 

```java
	public void process9(int aaa){
		
	}
	public void process9(String s){
		
	}
	public void process9(int a, String b){
		
	}
```



## Exception 처리

