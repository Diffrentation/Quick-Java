import React, { useState } from "react";

const SearchAndAdd = ({ onAdd }) => {
  const [searchQuery, setSearchQuery] = useState("");

  const handleSearchChange = (e) => {
    setSearchQuery(e.target.value);
  };

  const handleAddClick = () => {
    if (searchQuery.trim()) {
      onAdd(searchQuery);
      setSearchQuery("");
    }
  };

  return (
    <div className="flex items-center space-x-4 p-4  mr-48">
      <input
        type="text"
        value={searchQuery}
        onChange={handleSearchChange}
        placeholder="Write Notes..."
        className="border border-gray-300 rounded-lg p-2 w-full md:w-64"
      />
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
