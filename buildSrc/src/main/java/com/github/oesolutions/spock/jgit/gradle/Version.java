package com.github.oesolutions.spock.jgit.gradle;

import java.util.Objects;

public class Version
{
    private final String version;

    private final String spockVersion;

    private final String jgitVersion;

    public Version( final String version, final String spockVersion, final String jgitVersion )
    {
        this.version = version;
        this.spockVersion = spockVersion;
        this.jgitVersion = jgitVersion;
    }

    public String getVersion()
    {
        return version;
    }

    public String getSpockVersion()
    {
        return spockVersion;
    }

    public String getJgitVersion()
    {
        return jgitVersion;
    }

    @Override
    public boolean equals( final Object o )
    {
        if( this == o )
        {
            return true;
        }
        if( o == null || getClass() != o.getClass() )
        {
            return false;
        }
        final Version version1 = (Version)o;
        return version.equals( version1.version ) &&
                spockVersion.equals( version1.spockVersion ) &&
                jgitVersion.equals( version1.jgitVersion );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( version, spockVersion, jgitVersion );
    }

    @Override
    public String toString()
    {
        return String.format( "%s-spock-%s-jgit-%s", getVersion(), getSpockVersion(), getJgitVersion() );
    }
}
