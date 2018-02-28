// Get the modal
var modal = document.getElementById('myModal');
var signUpmodal = document.getElementById('signUpModal');

// Get the button that opens the modal
var btn = document.getElementById("login");
var signUpBtn = document.getElementById("signUp");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];
var signUpSpan = document.getElementsByClassName("signUpClose")[0];

// When the user clicks the button, open the modal 
btn.onclick = function() {
    modal.style.display = "block";
}
signUpBtn.onclick = function() {
    signUpmodal.style.display = "block";
}
// When the user clicks on <span> (x), close the modal
span.onclick = function() {
    modal.style.display = "none";
}
signUpSpan.onclick = function() {
    signUpModal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if(event.target == modal) {
        modal.style.display = "none";
    }
    if(event.target == signUpModal) {
        signUpModal.style.display = "none";
    }
}