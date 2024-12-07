import React from "react";
import "../App.css";

const HeroSection = () => {
  return (
    <>
      <div className="flex flex-col items-center justify-center h-screen bg-black text-white px-6 md:mt-28 lg:mt-0">
        {/* Main Heading */}
        <div className="z-40 w-screen">
          <div className="text-center flex flex-col mt-64 sm:text-start sm:ml-10 space-y-2 sm:z-10 sm:mt-80 lg:text-start lg:ml-20 lg:mt-56">
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
          <p className="text-lg text-center max-w-2xl leading-relaxed mb-20 sm:text-2xl sm:ml-10 sm:text-start sm:mt-16 sm:z-10 lg:text-start lg:text-3xl lg:ml-20 mt-6 xl:text-3xl  ">
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
      <div className=" flex flex-col mt-[8rem] w-screen text-center sm:mt-16 md:mt-52 lg:mt-42  lg:flex-row lg:ml-36 lg:text-start ">
        <div className="flex flex-col lg:pb-96">
          <h1 className="text-4xl sm:text-6xl font-bold lg:text-6xl">SINIOR</h1>
          <h1 className="text-4xl sm:text-6xl font-bold lg:text-6xl">
            DESIGNER
          </h1>
        </div>
        <div className="text-3xl font-semibold mt-5 leading-[4rem] px-7 sm:text-5xl sm:leading-[5rem] sm:px-40 lg:z-10  lg:text-3xl lg:-mt-20 xl:max-w-[50rem] ">
          I aspire to be a driving force behind a future where design is a
          powerful catalyst for positive change.
        </div>
      </div>

      <div className="mt-24 lg:-mt-36">
        <div className="h-[30rem] w-full flex justify-center rounded-xl px-46">
          <div className="flex text-center lg:w-[90rem] rounded-3xl overflow-hidden">
            <img
              src="https://cdn.pixabay.com/photo/2020/01/26/20/14/computer-4795762_1280.jpg"
              className="w-full h-full object-cover"
              alt="Background"
            />
          </div>
        </div>
      </div>

      <div className="w-screen ">
        <div>
          <div className="flex flex-col justify-center text-center mt-20">
            <div className="uppercase text-2xl">creative solutions</div>
            <div className="uppercase text-9xl font-bold">Services</div>
          </div>
        </div>
        <div className="h-96 w-[90rem] bg-slate-800"></div>
      </div>
    </>
  );
};

export default HeroSection;
