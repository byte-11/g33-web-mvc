const time = document.getElementById('time');

function showTime(){
    console.log(new Date())
    time.textContent = new Date();
}