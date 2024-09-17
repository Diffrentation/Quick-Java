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
  clearInput();
});

function clearInput() {
  document.getElementById("text-input").value = "";
}

download.addEventListener("click", (e) => {
  e.preventDefault();

  // Get the generated QR code image
  const QRimg = qrCodeContainer.querySelector("img");

  if (QRimg) {
    // Create a canvas context
    let imgContext = canvas.getContext("2d");

    // Set canvas width and height to match the QR image
    canvas.width = QRimg.width;
    canvas.height = QRimg.height;

    // Create a new Image object
    let image = new Image();
    image.src = QRimg.src; // Get the base64-encoded image source

    image.onload = () => {
      // Draw the image onto the canvas
      imgContext.drawImage(image, 0, 0);

      // Create a download link and set the image data as the href
      let downloadLink = document.createElement("a");
      downloadLink.href = canvas.toDataURL("image/jpeg", 0.9);
      let input = prompt("Enter the QR image name to download");
      downloadLink.download = `${input || "qrcode"}.html`;
      downloadLink.click(); // Trigger the download event
    };
  } else {
    alert("Please generate a QR code");
  }
});
