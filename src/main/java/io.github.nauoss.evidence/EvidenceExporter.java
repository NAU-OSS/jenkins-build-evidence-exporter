package io.github.nauoss.evidence;

import hudson.model.Run;

public class EvidenceExporter {

    private final EvidenceCollector collector;
    private final JsonEvidenceWriter writer;

    public EvidenceExporter() {
        this.collector = new EvidenceCollector();
        this.writer = new JsonEvidenceWriter();
    }

    public void export(Run<?, ?> build) {

        EvidenceModel evidence =
                collector.collect(build);

        String json =
                writer.write(evidence);

        // Save evidence
    }
}