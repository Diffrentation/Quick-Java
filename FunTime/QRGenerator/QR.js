// script.js
document.getElementById("generate-btn").addEventListener("click", () => {
  const qrCodeContainer = document.getElementById("qrcode");
  qrCodeContainer.innerHTML = ""; // Clear any previous QR code
  const text = document.getElementById("text-input").value;

  if (text.trim() !== "") {
    new QRCode(qrCodeContainer, {
      text: text,
      width: 128,
      height: 128,
    });
  } else {
    alert("Please enter some text or URL");
  }
});
