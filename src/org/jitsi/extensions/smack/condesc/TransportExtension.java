package org.jitsi.extensions.smack.condesc;

import org.jitsi.extensions.smack.*;

/**
 * A <tt>ExtensionElement</tt> that represents a "transport" child element.
 */
public class TransportExtension
    extends AbstractPacketExtension
{
    /**
     * The name of the "transport" element.
     */
    public static final String ELEMENT_NAME = "transport";

    /**
     * Creates a new instance and sets the XML namespace to
     * <tt>transport</tt>
     *
     * @param namespace the XML namespace of the "transport" element.
     */
    public TransportExtension(String namespace)
    {
        super(namespace, TransportExtension.ELEMENT_NAME);
    }
}
