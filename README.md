# Jenkins Build Evidence Exporter

Jenkins Build Evidence Exporter is an open-source Jenkins plugin that collects important metadata from completed Jenkins builds and exports it as a portable JSON evidence file.

## Project Status

This project is currently in early development. The Jenkins plugin is not ready for production use yet.

## Why This Project?

Jenkins provides detailed information about every build, including build status, timing, source control information, and build artifacts. However, this information normally remains associated with the Jenkins build and its user interface.

When teams need to preserve or share information about a specific build, manually collecting this information can be inconvenient and error-prone.

Jenkins Build Evidence Exporter provides a simple way to turn build information into a structured evidence file that can be stored, downloaded, archived, or processed by other tools.

The project intentionally focuses on a small and well-defined problem: exporting evidence from an individual Jenkins build.

## What Does It Export?

The initial version is designed to collect:

- Jenkins job name
- Build number
- Build status
- Build URL
- Build start time
- Build duration
- Git repository information
- Git branch
- Git commit SHA
- Build artifacts

The exported evidence is represented as JSON.

Example:

```json
{
  "schema_version": "1.0",
  "job": {
    "name": "payment-service"
  },
  "build": {
    "number": 152,
    "status": "SUCCESS",
    "started_at": "2026-09-24T10:20:00Z",
    "duration_seconds": 272
  },
  "source": {
    "scm": "git",
    "branch": "main",
    "commit": "abc123"
  },
  "artifacts": [
    {
      "name": "payment-service.jar",
      "path": "target/payment-service.jar"
    }
  ]
}
```

## How It Works

The plugin runs as part of Jenkins and obtains metadata from a completed build.

```text
Jenkins Build
      |
      v
Build Evidence Exporter
      |
      +-- Build metadata
      +-- Git information
      +-- Timing information
      +-- Artifact information
      |
      v
Evidence JSON
```

The generated evidence can be stored as a Jenkins build artifact or written to a configured output directory.

## Installation

The plugin can be installed manually from a `.hpi` package.

### 1. Download the Plugin

Download the latest `.hpi` package from the project's GitHub Releases page.

### 2. Install the Plugin in Jenkins

In Jenkins, open:

`Manage Jenkins → Plugins → Advanced`

Upload the downloaded `.hpi` file and install the plugin.

Restart Jenkins if required.

### 3. Configure a Job

Open a Jenkins job and select:

`Configure → Build Evidence Exporter`

Enable evidence export and configure the output options.

## Configuration

The plugin provides the following configuration options:

### Enable Evidence Export

Controls whether evidence is generated for the job.

### Output Format

The initial version supports:

- JSON

### Output Destination

The initial version supports storing evidence as a Jenkins build artifact.

A workspace output directory may also be configured for local or development use.

For example:

```text
evidence/
```

The resulting file may look like:

```text
evidence/
└── build-152.json
```

## Automatic Export

When automatic export is enabled, evidence is generated when a Jenkins build finishes.

For example:

```text
Build #152
    |
    v
Build completes
    |
    v
Evidence Exporter
    |
    v
build-152.json
```

Evidence can be generated for successful and unsuccessful builds because failed builds can also provide useful historical information.

## Manual Export

The plugin may also provide a manual export action from the Jenkins build page.

For example:

```text
Build #152
    |
    +-- Console Output
    +-- Changes
    +-- Artifacts
    +-- Export Evidence
```

Selecting `Export Evidence` generates the evidence file for that build.

## Pipeline Usage

The project is designed to support Jenkins Pipeline jobs.

A future Pipeline step may allow users to explicitly request evidence generation:

```groovy
exportBuildEvidence()
```

Automatic build-level evidence generation remains the primary workflow.

## Project Scope

This project intentionally focuses on build-level evidence.

The initial version does not attempt to provide a complete enterprise audit or compliance platform.

The project does not currently provide:

- Jira integration
- Pull request approval tracking
- Security scanning
- Production deployment tracking
- Database storage
- Cloud storage integration
- Cross-CI/CD platform support
- Compliance management

These capabilities may be considered for future versions.

## Roadmap

### v0.1

- Basic Jenkins plugin
- Collect build metadata
- Collect Git information
- Generate JSON evidence
- Store evidence as a Jenkins build artifact

### v0.2

- Artifact metadata
- Manual evidence export
- Improved configuration options

### v0.3

- Jenkins Pipeline integration
- Improved evidence schema
- Additional documentation

### Future

Potential future integrations include external storage and additional evidence sources.

The project will remain focused on providing a simple and understandable build evidence export mechanism.

## Contributing

Contributions are welcome.

You can contribute by:

- Reporting bugs
- Suggesting features
- Improving documentation
- Adding tests
- Improving the Jenkins integration
- Improving the evidence format
- Adding support for additional build metadata

Please read [CONTRIBUTING.md](CONTRIBUTING.md) before submitting an issue or pull request.

## Community

This project aims to provide a welcoming environment for users and contributors.

Please read [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) before participating in the project.

Project discussions, bug reports, and feature requests should be made through GitHub Issues.

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.