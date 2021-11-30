
var iconEyes =document.querySelector('.icon-eyes');

function show(){
    var ipPass =document.querySelector('#ip-pass');
    ipPass.setAttribute('type','text');
}
function  hide() {
    var ipPass =document.querySelector('#ip-pass');
    ipPass.setAttribute('type','password')
}
var current=0;
iconEyes.onclick=function(){
   
    if(current==0){
        current=1;
        show();
        
    }else{
        
        current=0;
        hide();
    }
   
}


