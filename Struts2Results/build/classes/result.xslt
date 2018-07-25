<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" />
	<xsl:template match="result">
		<html>
			<body>
				<h2>XSLT Result Example</h2>
				<h4>
					Name :
					<xsl:value-of select="name" />
				</h4>
				<h4>
					Address :
					<xsl:value-of select="address" />
				</h4>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>