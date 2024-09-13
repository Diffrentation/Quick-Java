const download = document.querySelector(".Download");
const qrCodeContainer = document.getElementById("qrcode");

document.getElementById("generate-btn").addEventListener("click", (e) => {
  e.preventDefault();

  // Clear any previous QR code
  qrCodeContainer.innerHTML = "";

  // Get the user input
  const userText = document.getElementById("text-input").value;

  if (userText.trim() !== "") {
    // Generate the QR code with user input
    new QRCode(qrCodeContainer, {
      text: userText,
      width: 128,
      height: 128,
    });
  } else {
    alert("Please enter some text or URL");
  }
});

download.addEventListener("click", (e) => {
  e.preventDefault();

  // Get the generated QR code image
  const img = qrCodeContainer.querySelector("img");

  if (img) {
    const imgSrc = img.src; // Get the base64-encoded image source

    // Set the href attribute to the image source and enable downloading
    download.setAttribute("href", imgSrc);
    download.setAttribute("download", "Image/png");
  } else {
    alert("Please generate a QR code");
  }
});
