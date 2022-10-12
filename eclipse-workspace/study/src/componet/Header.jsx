import NavList from "./NavList";
import styled from "styled-components";

const HeaderTag = styled.div`
  padding:20px 10px;background:#fafafa;box-shadow: 0 0 2px #ccc;
  &.div{
    max-width: 1200px;margin:0 auto;
  }
`

function Header(  ) {
    return(
        <>
        <HeaderTag>
            <div>
                <NavList/>
            </div>
        </HeaderTag>
        </>
    )
}
export default Header;