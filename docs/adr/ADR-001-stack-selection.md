# ADR-001: Technology Stack Selection

**Status:** Accepted  
**Date:** Phase 0  
**Deciders:** Engineering Team

## Context
We need to build a distributed notification engine supporting 
5 channels at 1M+ notifications/day. The stack must support 
async messaging, template management, deduplication, and 
delivery tracking.

## Decision
Java 21, Spring Boot 4, Kafka, RabbitMQ, Redis, 
PostgreSQL, MongoDB, Docker, AWS.

## Consequences
- Virtual threads (Loom) available for high-concurrency 
  channel services
- Kafka provides durable, replayable event streams
- Two databases adds operational complexity but serves 
  different access patterns correctly
- Team must be familiar with both SQL and NoSQL tooling