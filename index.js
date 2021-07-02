function x(){
    for(let i=0;i<=6;i++)
    {
     function close(i){
     setTimeout(function(){
     console.log(i);
    },i * 1000);
}
close(i);
}
    console.log("Bye");
}
x();
