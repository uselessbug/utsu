package com.utsusynth.utsu.common.data;

import com.google.common.base.Optional;

public class EnvelopeData {
    private final Optional<Double> envPreutter;
    private final Optional<Double> envLength;
    private final double[] widths; // "p" in milliseconds
    private final double[] heights; // "v" in % of total intensity (0-100)

    public EnvelopeData(double[] envWidths, double[] envHeights) {
        // TODO: Add more parameter checking here, don't just assume the inputs make sense.
        this.envPreutter = Optional.absent();
        this.envLength = Optional.absent();
        this.widths = envWidths;
        this.heights = envHeights;
    }

    public EnvelopeData(
            double envPreutter,
            double envLength,
            double[] envWidths,
            double[] envHeights) {
        this.envPreutter = Optional.of(envPreutter);
        this.envLength = Optional.of(envLength);
        this.widths = envWidths;
        this.heights = envHeights;
    }

    public Optional<Double> getPreutter() {
        return envPreutter;
    }

    public Optional<Double> getLength() {
        return envLength;
    }

    public double[] getWidths() {
        return widths;
    }

    public double[] getHeights() {
        return heights;
    }
}
