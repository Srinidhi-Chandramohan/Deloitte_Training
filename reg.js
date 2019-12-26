

function fn1()
{
var a=document.getElementById("id1").value;
var b="^[A-Za-z]+$";
if(!a.match(b))
    document.getElementById("s1").innerHTML="Name should be only in alphabets";
else
    document.getElementById("s1").innerHTML=" ";

}

function fn2()
{
var a=document.getElementById("id2").value;
var b="^[A-Za-z]+$";
if(!a.match(b))
    document.getElementById("s2").innerHTML="Name should be only in alphabets";
else
    document.getElementById("s2").innerHTML=" ";

}

function validate()
{
var a=document.getElementsByName("gender");
var count=0;
for(i=0;i<a.length;i++)
{
	if(a[i].checked)
		count++;
	}
	if(count==0){
		 document.getElementById("s3").innerHTML="Name should be only in alphabets";
	 return false;
	}
	 else{
		  document.getElementById("s2").innerHTML="";
	  return true;
	 }
}