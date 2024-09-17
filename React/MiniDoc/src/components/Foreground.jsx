import React, { useRef } from "react";
import Card from "./card";
import SearchAndAdd from "./SearchAndAdd";

function Foreground() {
  const ref = useRef(null);
  return (
    <>
      <div
        className=" fixed h-full w-screen z-[1] top-0 bg-transparent"
        ref={ref}
      >
        <div className="flex justify-end mt-5 ">
          <SearchAndAdd />
        </div>
        <div className="flex flex-wrap gap-5 m-5">
          <Card reference={ref} />
          <Card reference={ref} />
          <Card reference={ref} />
        </div>
      </div>
    </>
  );
}

export default Foreground;
