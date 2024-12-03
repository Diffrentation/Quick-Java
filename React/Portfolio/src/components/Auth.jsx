import React, { useState } from "react";

const Auth = () => {
  const [isLogin, setIsLogin] = useState(true);

  const handleSwitch = () => {
    setIsLogin((prevState) => !prevState);
  };

  return (
    <div className="flex flex-col items-center justify-center min-h-[90vh]  px-4">
      <div className="bg-black p-6 rounded-lg shadow-md w-full max-w-sm border-white border-[3px]">
        <h2 className="text-2xl font-semibold mb-4 text-white text-center">
          {isLogin ? "Login" : "Sign Up"}
        </h2>
        {isLogin ? (
          <div>
            <input
              type="email"
              placeholder="Email"
              className="border border-gray-300 p-2 w-full mb-4 rounded focus:outline-none focus:ring-2 focus:ring-blue-500"
            />
            <input
              type="password"
              placeholder="Password"
              className="border border-gray-300 p-2 w-full mb-4 rounded focus:outline-none focus:ring-2 focus:ring-blue-500"
            />
            <button className="w-full bg-blue-500 text-white py-2 rounded hover:bg-blue-600 transition">
              Login
            </button>
          </div>
        ) : (
          <div>
            <input
              type="text"
              placeholder="Username"
              className="border border-gray-300 p-2 w-full mb-4 rounded focus:outline-none focus:ring-2 focus:ring-blue-500"
            />
            <input
              type="email"
              placeholder="Email"
              className="border border-gray-300 p-2 w-full mb-4 rounded focus:outline-none focus:ring-2 focus:ring-blue-500"
            />
            <input
              type="password"
              placeholder="Password"
              className="border border-gray-300 p-2 w-full mb-4 rounded focus:outline-none focus:ring-2 focus:ring-blue-500"
            />
            <button className="w-full bg-blue-500 text-white py-2 rounded hover:bg-blue-600 transition">
              Sign Up
            </button>
          </div>
        )}
        <button
          onClick={handleSwitch}
          className="mt-4 text-blue-500 hover:underline"
        >
          Switch to {isLogin ? "Sign Up" : "Login"}
        </button>
      </div>
    </div>
  );
};

export default Auth;
