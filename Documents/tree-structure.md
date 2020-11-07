
<packages>
	<requirement file="{file name}" id="{requirement id}"> <!-- parent requirement -->
		<package name="{directory name}">
			<requirement file="{file name}" id="{requirement id}"> <!-- child requirememnt -->
				...
			</requirement>
			...
		</package>
	</requirement>

	<package name="{directory name}">
		<requirement file="{file name}" id="{requirement id}">
			...
		</requirement>
		<package name="{directory name}">
			...
		</package>
		...
	</package>
	...
</packages>
