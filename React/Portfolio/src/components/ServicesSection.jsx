import React from "react";

const Services = () => {
  return (
    <div className="flex flex-col items-center justify-center h-screen">
      <h1 className="text-3xl sm:text-4xl lg:text-5xl font-semibold text-green-800 mb-6">
        Our Services
      </h1>
      <ul className="text-lg sm:text-xl lg:text-2xl text-green-600 list-disc list-inside">
        <li>Web Design</li>
        <li>Web Development</li>
        <li>SEO Optimization</li>
        <li>Content Creation</li>
      </ul>
    </div>
  );
};

export default Services;
