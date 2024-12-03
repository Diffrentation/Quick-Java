import React, { useState } from "react";
import { Link } from "react-router-dom";
import { FaMoon, FaSun } from "react-icons/fa"; // Importing icons for dark and light mode

const Header = () => {
  const [isSidebarOpen, setIsSidebarOpen] = useState(false);
  const [isDarkMode, setIsDarkMode] = useState(false); // State for dark mode

  const toggleSidebar = () => {
    setIsSidebarOpen(!isSidebarOpen);
  };

  const closeSidebar = () => {
    setIsSidebarOpen(false);
  };

  const toggleDarkMode = () => {
    setIsDarkMode(!isDarkMode);
    document.body.classList.toggle("bg-black", !isDarkMode); // Change body background color based on mode
  };

  return (
    <div className="fixed top-0 w-full backdrop-blur-lg border-b-4 border-b-yellow-500 z-50">
      <nav className="flex justify-between items-center h-16 w-full px-4 border-t-4 border-t-yellow-500 sm:pl-14 lg:pl-32 sm:pr-10 mt-11 lg:mt-5">
        <div className="text-orange-700 text-lg font-bold">
          <Link to="/" className="sm:text-5xl text-2xl pl-4 sm:pl-0">
            Portfolio
          </Link>
        </div>

        {/* Desktop Menu (Tabs visible only on lg screens) */}
        <ul className="hidden lg:flex gap-4 sm:gap-6 lg:gap-8 text-orange-700">
          <li className="hover:text-gray-200 cursor-pointer">
            <Link to="/" className="xl:text-2xl">
              Home
            </Link>
          </li>
          <li className="hover:text-gray-200 cursor-pointer">
            <Link to="/about" className="xl:text-2xl">
              About
            </Link>
          </li>
          <li className="hover:text-gray-200 cursor-pointer">
            <Link to="/services" className="xl:text-2xl">
              Services
            </Link>
          </li>
          <li className="hover:text-gray-200 cursor-pointer">
            <Link to="/contact" className="xl:text-2xl">
              Contact
            </Link>
          </li>
          <li className="hover:text-gray-200 cursor-pointer">
            <Link to="/auth" className="xl:text-2xl">
              Login
            </Link>
          </li>
        </ul>

        {/* Mobile Menu Icon (Visible on sm and md screens) */}
        <div className="lg:hidden flex items-center">
          {/* Hamburger Icon */}
          <button
            onClick={toggleSidebar}
            className="text-white hover:text-gray-200"
          >
            <svg
              className="w-6 h-6"
              fill="none"
              stroke="currentColor"
              viewBox="0 0 24 24"
              xmlns="http://www.w3.org/2000/svg"
            >
              <path
                strokeLinecap="round"
                strokeLinejoin="round"
                strokeWidth="2"
                d="M4 6h16M4 12h16m-7 6h7"
              ></path>
            </svg>
          </button>

          {/* Dark/Light Mode Toggle Button */}
          <button onClick={toggleDarkMode} className="ml-4">
            {isDarkMode ? (
              <FaSun className="text-yellow-300" />
            ) : (
              <FaMoon className="text-gray-400" />
            )}
          </button>
        </div>
      </nav>

      {/* Mobile Sidebar */}
      <div
        className={`fixed top-0 right-0 w-34 sm:w-44 h-full z-40 transform transition-transform backdrop-blur-3xl ${
          isSidebarOpen ? "translate-x-0" : "translate-x-full"
        }`}
      >
        <div className="flex justify-between items-center p-4 border-b border-yellow-400">
          <span className="text-white text-xl font-bold">Menu</span>
          <button
            onClick={closeSidebar}
            className="text-white hover:text-gray-200"
          >
            <svg
              className="w-6 h-6"
              fill="none"
              stroke="currentColor"
              viewBox="0 0 24 24"
              xmlns="http://www.w3.org/2000/svg"
            >
              <path
                strokeLinecap="round"
                strokeLinejoin="round"
                strokeWidth="2"
                d="M6 18L18 6M6 6l12 12"
              ></path>
            </svg>
          </button>
        </div>
        <ul className="flex flex-col gap-6 p-6 text-white">
          <li className="hover:text-gray-200 cursor-pointer">
            <Link to="/" className="text-lg" onClick={closeSidebar}>
              Home
            </Link>
          </li>
          <li className="hover:text-gray-200 cursor-pointer">
            <Link to="/about" className="text-lg" onClick={closeSidebar}>
              About
            </Link>
          </li>
          <li className="hover:text-gray-200 cursor-pointer">
            <Link to="/services" className="text-lg" onClick={closeSidebar}>
              Services
            </Link>
          </li>
          <li className="hover:text-gray-200 cursor-pointer">
            <Link to="/contact" className="text-lg" onClick={closeSidebar}>
              Contact
            </Link>
          </li>
          <li className="hover:text-gray-200 cursor-pointer">
            <Link to="/auth" className="text-lg" onClick={closeSidebar}>
              Login
            </Link>
          </li>
        </ul>
      </div>

      {/* Overlay */}
      {isSidebarOpen && (
        <div
          className="fixed inset-0 bg-black bg-opacity-50 z-30"
          onClick={closeSidebar}
        ></div>
      )}
    </div>
  );
};

export default Header;
