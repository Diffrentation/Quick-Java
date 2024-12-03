import React from "react";
import "../App.css";

const HeroSection = () => {
  return (
    <>
      <div className="flex flex-col items-center justify-center h-screen bg-black text-white px-6 md:mt-28 lg:mt-0">
        {/* Main Heading */}
        <div className="z-40">
          <div className="text-center sm:text-start space-y-2 sm:z-10 lg:-ml-[22rem] lg:mt-56">
            <h1 className="text-5xl sm:text-8xl lg:text-9xl font-bold">
              HELLO!
              <span className="text-blue-300 italic font-thin"> I'M</span> A
            </h1>
            <h2 className="text-5xl sm:text-7xl lg:text-9xl font-semibold">
              WEB DESIGNER
            </h2>
            <h3 className="text-5xl sm:text-7xl lg:text-9xl text-blue-300 italic font-thin">
              DEVELOPER
            </h3>
          </div>

          {/* Subtext */}
          <p className="text-lg sm:text-2xl sm:mt-16 sm:z-10 lg:text-start lg:text-2xl lg:-ml-[22rem] mt-6 sm:text-start text-center max-w-2xl leading-relaxed mb-20">
            Beautiful design has the power to captivate audiences and drive
            business growth. Specializing in creating stunning designs that
            transform businesses worldwide.
          </p>
        </div>

        <div className="lg:absolute top-[36rem] sm:top-[41rem] lg:top-[9rem] lg:left-[50rem] z-0">
          <img
            src="https://images.unsplash.com/photo-1450133064473-71024230f91b?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            alt="image"
            height={900}
          />
          <div className="flex justify-center text-2xl">Who I am</div>
        </div>
      </div>

      <div className="">
        <div className=" flex flex-col  text-center sm:mt-16 lg:mt-56 lg:flex-row lg:ml-72 lg:text-start ">
          <div className="flex flex-col lg:pb-96">
            <h1 className="text-4xl sm:text-6xl font-bold lg:text-7xl">
              SINIOR
            </h1>
            <h1 className="text-4xl sm:text-6xl font-bold lg:text-7xl">
              DESIGNER
            </h1>
          </div>
          <div className="text-3xl lg:z-10 font-semibold mt-5 leading-[4rem] px-7 sm:text-5xl sm:leading-[5rem] sm:px-40 lg:text-4xl lg:w-[50rem] lg:-mt-20 ">
            I aspire to be a driving force behind a future where design is a
            powerful catalyst for positive change.
          </div>
        </div>
      </div>
    </>
  );
};

export default HeroSection;
