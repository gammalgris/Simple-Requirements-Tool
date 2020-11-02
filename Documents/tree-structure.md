
<packages>
	<requirement file="{file name}" id="{requirement id}"> <!-- parent requirement -->
		<{directory name}>
			<requirement file="{file name}" id="{requirement id}"> <!-- child requirememnt -->
				...
			</requirement>
			...
		</{directory name}>
	</requirement>

	<{directory name}>
		<requirement file="{file name}" id="{requirement id}">
			...
		</requirement>
		<{directory name}>
			...
		</{directory name}>
		...
	</{directory name}>
	...
</packages>