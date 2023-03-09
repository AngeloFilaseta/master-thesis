# Distributed monitoring and control with dynamic offloading: the case of the Alchemist Simulator
![LaTeX](https://img.shields.io/badge/latex-%23008080.svg?style=for-the-badge&logo=latex&logoColor=white)
![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)
![GitHub Actions](https://img.shields.io/badge/github%20actions-%232671E5.svg?style=for-the-badge&logo=githubactions&logoColor=white)

Started from [pikalab-unibo/thesis-template](https://github.com/pikalab-unibo/thesis-template).

# Abstract

The ability to monitor and steer the behavior of complex distributed systems is an increasingly hot research topic.
An innovative architecture that facilitates the dynamic redistribution of computational load across multiple devices
 for monitoring systems is introduced in this thesis. The proposed architecture has been designed and evaluated within
 the context of Alchemist, a stochastic simulator that runs on the Java Virtual Machine (JVM).

The primary focus of this project pertains to the hosting of simulations on a server machine and the challenge of
managing a potentially large number of clients who wish to visualize and interact with it. The proposed architecture
focuses on two strategies that can be dynamically managed based on the available resources. In the first approach,
the server is responsible of rendering the simulation and transmitting the visual representation to the connecting
client.
In the second approach, the server only supplies the raw data to the client, which then executes the rendering
 operation on its local machine.

In the flow of this thesis, some background about the Alchemist Simulator is given.
Following an extensive analysis phase, Kotlin Multiplatform was selected as the primary framework.
This technology greatly facilitated the development of a multiplatform architecture which is flexible and robust.
Lots of implementative details are given to the reader, with a focus on how the Alchemist Simulator is able to
interact with the proposed architecture. It is also explained in details how it was possible to reach a good level
of interoperability between two very different ecosystems, addressing the considerable problems of serialization.
Finally, since this project is meant to be a proof of concept, a wide range of future works are presented, explaining
how it would be possible to enrich the system with little to no changes to the proposed architecture.

### Useful Links
__Context__: [The Alchemist Simulator](https://github.com/AlchemistSimulator/)

__My Supervisors__: Danilo Pianini ([DanySK](https://github.com/DanySK) on GitHub) and Gianluca Aguzzi ([cric96](https://github.com/cric96) on GitHub)
