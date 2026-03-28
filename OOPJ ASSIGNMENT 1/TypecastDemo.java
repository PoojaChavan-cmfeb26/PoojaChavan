import java.util.*;
class TypecastDemo
{

public static void main (String args[])
{

int ival=10;
double dval= 23.5;
char ch='A';

ival=ch;  //int=char
System.out.println("ival="+ival);

ch =(char)ival; //need type casting here to fix this
System.out.println("ch=" +ch);

dval=ival;
System.out.println("dval=" +dval);
ival=(int)dval; //incompatible if ival=dval
}

}