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

> 프로그램을 만들어서 실행하다보면 가끔씩 프로그램이 강제종료 될 때가 있는데 이를 Error라고 하며, 이런 실행 시간 오류들 중에 JVM에서 유형을 분석할 수 있는 Error를 예외라고 합니다.

####Try..Catch

```java
public class ExceptionMain {

	public static void main(String[] args) {
		
		int array[] = new int[6];

		// java.lang.ArrayIndexOutOfBoundsException 예
		try {

			array[0] = 5;
			array[5] = 10;
			// 에러가 발생하더라도 결과값을 리턴해야한다
			//array[6] = 11;
			
			int x = 1/0;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}finally {
			// Try-catch 를 통해 문제가 생겨도 일단은 진행을 시켜라
			System.out.println("다섯번째값은 : " + array[5]);
		}
		System.out.print("시스템이 완료되었습니다");
	}

}
```


## 다형성 

> 다형성이란 하나의 메소드나 클래스가 있을 때 이것들이 다양한 방법으로 동작하는 것을 의미한다.

상속관계에 있을때 
상속받은 자식객체를 부모객체의 타입으로 대체할 수 있다 

(내 타입을 부모타입으로 바꿀 수 있다)

```java
Son son = new Son(); 을

Father son = new Son(); 로 가능하다 
```

이런식으로 선언을 하면 두 클래스에서 같은 이름의 메소드로 오버라이드가 됐을 때 

Son의 Method를 호출한다 
		
마치 **어댑터** 어떤 클래스에던 딱 맞춰서 쓸수있다
	
많은 메소드를 가진 Son에 Father를 상속하면 그 Father를 상속하는 
	
기본적인, 필수적인 기능들을 가져와 쓸 수 있다 
	
***글로쓸라니참힘들다***

