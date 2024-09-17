import React from "react";
import { Container, Typography, Button } from "@mui/material";

const HeroSection = () => {
  return (
    <Container>
      <Typography variant="h2">Welcome to My Portfolio</Typography>
      <Typography variant="h5">I am a Web Developer</Typography>
      <Button variant="contained">Learn More</Button>
    </Container>
  );
};

export default HeroSection;
