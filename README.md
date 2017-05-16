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


## 추상클래스

> 1. 인터페이스와 동일한데  
> 2. 인터페이스 + 클래스 (인터페이스에 클래스를 추가할 수 있다) 
> 로직이 추상화 될 수 있을때 Abstract 를 사용할 수 있다 


```java
public abstract class Fix {

	public void process() {
		disassemble();
		for (int i = 0; i < 3; i++) {
			replacePart();
			clean();
			assemble();
		}
	}

	public abstract void disassemble();

	public abstract void replacePart();

	public abstract void clean();

	public abstract void assemble();

}
```


## Interface 

> A Java interface is a bit like a class, except a Java interface can only contain method signatures and fields. An Java interface cannot contain an implementation of the methods, only the signature (name, parameters and exceptions) of the method.
> 
> 
> 인터페이스는 일종의 추상클래스이다. 인터페이스는 추상클래스처럼 추상메서드를 갖지만 추상클래스보다 추상화 정도가 높아서 추상클래스와 달리 몸통을 갖춘 일반 메서드 또는 멤버변수를 구성원으로 가질 수 없다. 



## Exception

프로그램을 만들어서 실행하다보면 가끔씩 프로그램이 강제종료 될 때가 있는데 이를 Error라고 하며, 이런 실행 시간 오류들 중에 JVM에서 유형을 분석할 수 있는 Error를 예외라고 합니다.



