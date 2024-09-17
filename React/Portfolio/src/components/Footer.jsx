import React from "react";
import { Container, Typography } from "@mui/material";

const Footer = () => {
  return (
    <Container>
      <Typography variant="body2" align="center">
        © {new Date().getFullYear()} Your Name. All rights reserved.
      </Typography>
    </Container>
  );
};

export default Footer;
