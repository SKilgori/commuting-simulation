module commuting.simulation {
    // Export runtime packages
    exports car;
    exports person;
    exports station;

    // Use java.logging for light-weight logging in the module (no external deps required)
    requires java.logging;

    // NOTE: JUnit should normally be provided on the test module-path rather than required
    // by the main module. The line below is retained only because the original project
    // referenced org.junit.jupiter.api in its module descriptor. If you split production
    // and test modules or use the classpath for tests, you can remove this.
    requires org.junit.jupiter.api;
}
