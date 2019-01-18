<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xsd="http://www.it-academy.by">
    <xsl:output method="html"/>

    <xsl:template match="/xsd:pointsList">
        <html>
            <head>
                <title>XML-to-HTML transformation example</title>
            </head>
            <body>
                <h2 align="center">Results of transformation from XML to HTML:</h2>
                <table border="1" align="center" cellpadding="5">
                    <caption>&#171;x&#187; and &#171;y&#187; values from XML-file:</caption>
                    <tr bgcolor="#CCC" align="center">
                        <th>x, units</th>
                        <th>y, units</th>
                    </tr>
                    <xsl:for-each select="xsd:point">
                        <tr align="center">
                            <td>
                                <xsl:value-of select="xsd:x"/>
                                <span>&#160;</span>
                                <xsl:value-of select="@unit"/>
                            </td>
                            <td>
                                <xsl:value-of select="xsd:y"/>
                                <span>&#160;</span>
                                <xsl:value-of select="@unit"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
                <br/>
                <div align="center">
                    <strong>
                        <i>XSLT was used during transformation.</i>
                    </strong>
                </div>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>