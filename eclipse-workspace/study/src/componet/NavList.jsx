import styled from "styled-components";
import Button from "./Button";

const Nav = styled.nav`
ul {
  display: flex;justify-content:space-between;
  li {
    list-style: none;font-size:1.2vw;
  }
}
`

function NavList(){
    return(
        <>
            <Nav>
                <ul>
                    <li>
                        <Button text="리스트"/>
                    </li>
                </ul>
            </Nav>
        </>
    )
}
export default NavList;