// src/components/SearchAndAdd.js

import React, { useState } from "react";

const SearchAndAdd = () => {
  const [searchQuery, setSearchQuery] = useState("");

  const handleSearchChange = (e) => {
    setSearchQuery(e.target.value);
  };

  const handleAddClick = () => {
    console.log("Add button clicked!");
    // Add your add functionality here
  };

  return (
    <div className="flex items-center space-x-4 p-4">
      {/* Search Field */}
      <input
        type="text"
        value={searchQuery}
        onChange={handleSearchChange}
        placeholder="Write Notes..."
        className="border border-gray-300 rounded-lg p-2 w-full md:w-64"
      />

      {/* Add Button */}
      <button
        onClick={handleAddClick}
        className="bg-blue-500 text-white rounded-lg p-2 hover:bg-blue-600 transition"
      >
        Add
      </button>
    </div>
  );
};

export default SearchAndAdd;
