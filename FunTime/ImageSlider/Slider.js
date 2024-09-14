const slides = document.querySelectorAll(".slide");
let counter = 0;

// Initialize slides
slides.forEach((slide, index) => {
  slide.style.left = index * 100 + "%";
});

const nextSlide = () => {
  counter++;
  if (counter >= slides.length) counter = 0; // Wrap around to first slide
  slideImage();
};

const prevSlide = () => {
  counter--;
  if (counter < 0) counter = slides.length - 1; // Wrap around to last slide
  slideImage();
};

const slideImage = () => {
  const offset = -counter * 100 + "%";
  document.querySelector(".slides").style.transform = `translateX(${offset})`;
};

// Add event listeners for next and prev buttons
document.querySelector(".next").addEventListener("click", nextSlide);
document.querySelector(".prev").addEventListener("click", prevSlide);
