import React, { useRef, useState } from "react";
import Card from "./card";
import SearchAndAdd from "./SearchAndAdd";

function Foreground() {
  const ref = useRef(null);
  const [cards, setCards] = useState([]);

  const handleAddCard = (newDesc) => {
    const newCard = {
      desc: newDesc,
      fileSize: "5mb", // Example placeholder data
      createdAt: new Date().toLocaleDateString(),
      id: Date.now(), // Unique id for each card
    };
    setCards([...cards, newCard]);
  };

  return (
    <>
      <div
        className="fixed h-full w-screen z-[1] top-0 bg-transparent"
        ref={ref}
      >
        <div className="flex justify-end mt-5">
          <SearchAndAdd onAdd={handleAddCard} />
        </div>
        <div className="flex flex-wrap gap-5 m-5">
          {cards.map((card) => (
            <Card key={card.id} data={card} reference={ref} />
          ))}
        </div>
      </div>
    </>
  );
}

export default Foreground;
