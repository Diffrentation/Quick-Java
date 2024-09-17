import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Header from "./components/Header";
import HeroSection from "./components/HeroSection";
import AboutSection from "./components/AboutSection";
import ServicesSection from "./components/ServicesSection";
import ContactSection from "./components/ContactSection";
import Footer from "./components/Footer";

function App() {
  return (
    <Router>
      <Header />
      <Routes>
        <Route path="/" element={<HeroSection />} />
        <Route path="/about" element={<AboutSection />} />
        <Route path="/services" element={<ServicesSection />} />
        <Route path="/contact" element={<ContactSection />} />
      </Routes>
      <Footer />
    </Router>
  );
}

export default App;
