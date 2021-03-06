import React from "react";
import { NextPage } from "next";
import Navigation from "../../components/navigation/navigation";
import Container from "../../components/ui/container/container";
import PerfumeListHeader from "../../components/perfumeListHeader/perfumeListHeader";
import PerfumeList from "../../components/perfumeList/perfumeList";
import Head from "next/head";

const PerfumesPage: NextPage = () => {
  return (
    <>
      <Head>
        <title>전체 향수</title>
        <link rel="icon" href="/logos/iconLogo.png" />
      </Head>
      <Navigation />
      <Container isTop={true}>
        <PerfumeListHeader />
      </Container>
      <Container isTop={false}>
        <PerfumeList />
      </Container>
    </>
  );
};

export default PerfumesPage;
