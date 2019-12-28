function uname_chck()
{
var a= document.getElementById("admin_signup_uname").value;
var b="^[A-Za-z]+$";
if(!a.match(b))
{
document.getElementById("uname_span").innerHTML="Please enter username in alphabets";

return false;
}
else
document.getElementById("uname_span").innerHTML="";
return true;
}
function pswd_chck()
{
var a= document.getElementById("admin_signup_pswd").value;
var b="^[A-Za-z]+[@!#$%^&*]{1}[0-9]+";
if(!a.match(b))
{
document.getElementById("pswd_span").innerHTML="Please enter username with atleast 1 speacial character & 1 number. Use this format aaa@78";
return false;}
else 
document.getElementById("pswd_span").innerHTML="";
return true;
}

function c_pswd_chck()
{
var a= document.getElementById("admin_signup_pswd").value;
var b=document.getElementById("admin_signup_c_pswd").value;
if(a!=b){
document.getElementById("c_pswd_span").innerHTML="Passwords does not match";
return false;
}
else
document.getElementById("c_pswd_span").innerHTML="";
return true;

}

function phone_chck(){
var a= document.getElementById("admin_signup_phone").value;
var b="^[0-9]{10}$";
if(!a.match(b))
{
document.getElementById("phone_span").innerHTML="Please enter valid phone numbers";
return false;
}
else
document.getElementById("phone_span").innerHTML="";
return true;
}
function email_chck()
{
var a= document.getElementById("admin_signup_email").value;
var b="^[A-Za-z0-9!$._%+-]+@[A-Za-z0-9]+\.[a-z]{2,3}$";
if(!a.match(b))
{
document.getElementById("email_span").innerHTML="Please enter a valid email";
return false;
}
else
document.getElementById("email_span").innerHTML="";
return true;
}

function validate()
{
var a=uname_chck();
var b=pswd_chck();
var c=c_pswd_chck();
var d=phone_chck();
var e=email_chck();
if(a && b && c && d && e)
{
	return true;
}
else
{
	document.getElementById("submit_span").innerHTML="Please fill all the fields correctly";
	return false;
}


}











