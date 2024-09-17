import React from "react";

function bg() {
  return (
    <>
      <div className=" relative w-full h-screen bg-zinc-800 ">
        <div className="  text-yellow-100 font-semibold flex justify-center text-2xl">
          Documents
        </div>
        <h1 className=" absolute top-1/2 left-1/2 -translate-x-[50%] -translate-y-[50%] text-[30vw] font-semibold leading-none tracking-tight text-white   skew-x-6 skew-y-6  ">
          Docs
        </h1>
      </div>
    </>
  );
}

export default bg;
