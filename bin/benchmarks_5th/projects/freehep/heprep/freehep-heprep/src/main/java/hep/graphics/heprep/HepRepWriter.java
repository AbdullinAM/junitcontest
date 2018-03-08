// AID-GENERATED
// =========================================================================
// This class was generated by AID - Abstract Interface Definition          
// DO NOT MODIFY, but use the org.freehep.aid.Aid utility to regenerate it. 
// =========================================================================

// Copyright 2002-2005, Freehep.
package hep.graphics.heprep;

import java.io.IOException;
import java.util.List;

/**
 * HepRepWriter interface.
 *
 * @author Mark Donszelmann
 */
public interface HepRepWriter {

    /**
     * Adds a property, to be written to the HepRep file when closed.
     *
     * @param key
     * @param value
     * @throws IOException in case of a stream problem.
     */
    public void addProperty(String key, String value) throws IOException;

    /**
     * Closes the writer and its underlying stream.
     *
     * @throws IOException in case of a stream problem.
     */
    public void close() throws IOException;

    /**
     * Writes a HepRep.
     *
     * @param heprep to be written.
     * @param name for the heprep to be written (for tagged access), may be ommited.
     * @throws IOException in case of a stream problem.
     */
    public void write(HepRep heprep, String name) throws IOException;

    /**
     * Writes the layerOrder.
     *
     * @param layerOrder to be written.
     * @throws IOException in case of a stream problem.
     */
    public void write(List/*<String>*/ layerOrder) throws IOException;

    /**
     * Writes a HepRepTypeTree.
     *
     * @param typeTree to be written.
     * @throws IOException in case of a stream problem.
     */
    public void write(HepRepTypeTree typeTree) throws IOException;

    /**
     * Writes a HepRepType.
     *
     * @param type to be written.
     * @throws IOException in case of a stream problem.
     */
    public void write(HepRepType type) throws IOException;

    /**
     * Writes a HepRepTreeID.
     *
     * @param treeID to be written.
     * @throws IOException in case of a stream problem.
     */
    public void write(HepRepTreeID treeID) throws IOException;

    /**
     * Writes a HepRepAction.
     *
     * @param action to be written.
     * @throws IOException in case of a stream problem.
     */
    public void write(HepRepAction action) throws IOException;

    /**
     * Writes a HepRepInstanceTree.
     *
     * @param instanceTree to be written.
     * @throws IOException in case of a stream problem.
     */
    public void write(HepRepInstanceTree instanceTree) throws IOException;

    /**
     * Writes a HepRepInstance.
     *
     * @param instance to be written.
     * @throws IOException in case of a stream problem.
     */
    public void write(HepRepInstance instance) throws IOException;

    /**
     * Writes a HepRepPoint.
     *
     * @param point to be written.
     * @throws IOException in case of a stream problem.
     */
    public void write(HepRepPoint point) throws IOException;

    /**
     * Writes a HepRepAttribute.
     *
     * @param attribute to be written.
     * @throws IOException in case of a stream problem.
     */
    public void write(HepRepAttribute attribute) throws IOException;

    /**
     * Writes a HepRepDefinition.
     *
     * @param definition to be written.
     * @throws IOException in case of a stream problem.
     */
    public void write(HepRepDefinition definition) throws IOException;

    /**
     * Writes a HepRepAttValue.
     *
     * @param attValue to be written.
     * @throws IOException in case of a stream problem.
     */
    public void write(HepRepAttValue attValue) throws IOException;

    /**
     * Writes a HepRepAttDef.
     *
     * @param attDef to be written.
     * @throws IOException in case of a stream problem.
     */
    public void write(HepRepAttDef attDef) throws IOException;
} // class or interface
