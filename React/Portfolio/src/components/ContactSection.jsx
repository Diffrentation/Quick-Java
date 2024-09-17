import React from "react";
import { Container, Typography, TextField, Button } from "@mui/material";

const ContactSection = () => {
  return (
    <Container>
      <Typography variant="h4">Contact Me</Typography>
      <TextField label="Name" fullWidth />
      <TextField label="Email" fullWidth />
      <TextField label="Message" multiline rows={4} fullWidth />
      <Button variant="contained">Send</Button>
    </Container>
  );
};

export default ContactSection;
