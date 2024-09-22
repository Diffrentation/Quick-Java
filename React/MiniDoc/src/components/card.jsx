import React from "react";
import { IoDocumentTextOutline } from "react-icons/io5";
import { MdOutlineFileDownload } from "react-icons/md";
import { motion } from "framer-motion";

function Card({ reference, data }) {
  return (
    <motion.div
      drag
      dragConstraints={reference}
      whileDrag={{ scale: 1.1 }}
      dragTransition={{ bounceStiffness: 300, bounceDamping: 50 }}
      className="relative h-[17rem] w-[13rem] bg-gray-900 rounded-[20px] overflow-hidden"
    >
      <div className="pt-4 pl-4">
        <IoDocumentTextOutline />
      </div>
      <p className="absolute leading-tight text-sm px-3 pt-4">{data.desc}</p>
      <div className="h-[2.3rem] w-full bg-green-500 absolute bottom-0">
        <div className="flex px-5 bg-amber-40 mt-[4px] justify-between ">
          <p>{data.fileSize}</p>
          <span className="bg-white relative top-[3px] rounded-full h-[1.3rem] w-[1.3rem] p-[1px]">
            <MdOutlineFileDownload
              className="top-[3px] left-[2px] cursor-pointer absolute"
              color="black"
            />
          </span>
        </div>
      </div>
    </motion.div>
  );
}

export default Card;
