using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace Database.Migrations
{
    public partial class NoShadowProps : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Workouts_Users_CreatedBy",
                table: "Workouts");

            migrationBuilder.DropIndex(
                name: "IX_Workouts_CreatedBy",
                table: "Workouts");

            migrationBuilder.AlterColumn<int>(
                name: "CreatedBy",
                table: "Workouts",
                type: "INTEGER",
                nullable: false,
                oldClrType: typeof(int),
                oldType: "INTEGER",
                oldDefaultValue: 0);

            migrationBuilder.AddColumn<int>(
                name: "MemberId",
                table: "Workouts",
                type: "INTEGER",
                nullable: true);

            migrationBuilder.CreateIndex(
                name: "IX_Workouts_MemberId",
                table: "Workouts",
                column: "MemberId");

            migrationBuilder.AddForeignKey(
                name: "FK_Workouts_Users_MemberId",
                table: "Workouts",
                column: "MemberId",
                principalTable: "Users",
                principalColumn: "Id");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Workouts_Users_MemberId",
                table: "Workouts");

            migrationBuilder.DropIndex(
                name: "IX_Workouts_MemberId",
                table: "Workouts");

            migrationBuilder.DropColumn(
                name: "MemberId",
                table: "Workouts");

            migrationBuilder.AlterColumn<int>(
                name: "CreatedBy",
                table: "Workouts",
                type: "INTEGER",
                nullable: false,
                defaultValue: 0,
                oldClrType: typeof(int),
                oldType: "INTEGER");

            migrationBuilder.CreateIndex(
                name: "IX_Workouts_CreatedBy",
                table: "Workouts",
                column: "CreatedBy");

            migrationBuilder.AddForeignKey(
                name: "FK_Workouts_Users_CreatedBy",
                table: "Workouts",
                column: "CreatedBy",
                principalTable: "Users",
                principalColumn: "Id");
        }
    }
}
