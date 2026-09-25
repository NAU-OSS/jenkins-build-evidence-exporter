# Architecture

## Overview

Jenkins Build Evidence Exporter is a Jenkins plugin that collects metadata from a completed Jenkins build and exports the information as a structured JSON evidence file.

The plugin is intentionally designed with a small number of components.

```text
Jenkins Build
      |
      v
Evidence Collector
      |
      v
Evidence Model
      |
      v
JSON Writer
      |
      v
Evidence File