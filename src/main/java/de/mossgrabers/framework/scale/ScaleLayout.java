// Written by Jürgen Moßgraber - mossgrabers.de
// (c) 2017-2021
// Licensed under LGPLv3 - http://www.gnu.org/licenses/lgpl-3.0.txt

package de.mossgrabers.framework.scale;

/**
 * Layouts that can be applied to a scale by using an 8x8 pad grid.
 *
 * @author J&uuml;rgen Mo&szlig;graber
 */
public enum ScaleLayout
{
    /** Upwards in fourth steps -> 3 notes once it repeats. */
    GRID_3("3 GRID"),
    GRID_4("4 GRID"),
    GRID_5("5 GRID"),
    /** Upwards in eighth steps. */
    GRID_7("7 GRID ^"),
    /** Sequential up */
    GRID_SEQUENTIAL("SEQUENTIAL");


    private static final String [] scaleLayoutNames = new String [5];
    static
    {
        final ScaleLayout [] values = ScaleLayout.values ();
        for (int i = 0; i < values.length; i++)
            scaleLayoutNames[i] = values[i].name;
    }

    private String name;


    /**
     * Constructor.
     *
     * @param name The name of the color
     */
    ScaleLayout (final String name)
    {
        this.name = name;
    }


    /**
     * Get the name of the scale layout.
     *
     * @return The name
     */
    public String getName ()
    {
        return this.name;
    }


    /**
     * Get the names of all scale layouts.
     *
     * @return The names of all scales
     */
    public static String [] getNames ()
    {
        return scaleLayoutNames;
    }


    /**
     * Get a scale layout by its name.
     *
     * @param name The name of the layout
     * @return The layout or null if it does not exist
     */
    public static ScaleLayout getByName (final String name)
    {
        for (final ScaleLayout layout: ScaleLayout.values ())
        {
            if (layout.getName ().equals (name))
                return layout;
        }
        return null;
    }
}
